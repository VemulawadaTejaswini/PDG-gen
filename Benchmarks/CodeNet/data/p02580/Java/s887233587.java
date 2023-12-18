/*****Author: Satyajeet Singh************************************/
    import java.io.*;
    import java.util.*;
    import java.text.*; 
    import java.lang.*;
    import java.math.*;
public class Main{
/*********************************************Constants******************************************/
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));        
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long mod=(long)1e9+7;
    static long mod1=998244353;
    static ArrayList<Integer> graph[];
    static int pptr=0,pptrmax=0;
    static String st[];
/*****************************************Solution Begins***************************************/    
    static class MultiTreeSet<K>{
        TreeMap<K,Integer> map;
        int sz;
        MultiTreeSet(){
            map=new TreeMap<>();
            sz=0;
        }
        boolean contains(K element){
            return map.containsKey(element);
        }
        void add(K element){
            map.put(element,map.getOrDefault(element,0)+1);
            sz++;
        }        
        void remove(K element){
            int u=map.get(element);
            map.put(element,u-1);
            if(u==1){
                map.remove(element);
            }
            sz--;
        }
        K lower(K val){
            return map.lowerKey(val);
        }
        K higher(K val){
            return map.higherKey(val);
        }
        K last(){
            return map.lastKey();
        }
        K first(){
            return map.firstKey();
        }
        int size(){
            return sz;
        }
        boolean isEmpty(){
            return sz==0;
        }
        ArrayList<K> asArray(){
            ArrayList<K> list=new ArrayList<>();
            for(K u:map.keySet()){
                int cur=map.get(u);
                while(cur-->0){
                    list.add(u);
                }
            }
            return list;
        }
        public String toString(){
            ArrayList<K> ls=asArray();
            String str="[ ";
            for(K u:ls)str+=(u+", ");
            return str+" ]";
        }
    }
    public static void main(String args[]) throws Exception{      
        int n=pi();
        int m=pi();
        int k=pi();
        ArrayList<Integer> ls[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            ls[i]=new ArrayList<>();
        }
        int f[]=new int[m];
        for(int i=0;i<k;i++){
            int a=pi()-1;
            int b=pi()-1;
            ls[a].add(b);
            f[b]++;
        }
        MultiTreeSet<Integer> set=new MultiTreeSet<>();
        for(int i=0;i<m;i++){
            if(f[i]==0)continue;
            set.add(f[i]);
        }
        long ans=0;
        for(int i=0;i<n;i++){
            int sz=ls[i].size();
            ans=Math.max(ans,sz);
            for(int u:ls[i]){
                set.remove(f[u]);
                ans=Math.max(ans,sz+f[u]-1);        
            }     
            if(!set.isEmpty()){
                ans=Math.max(ans,set.last()+sz);
            }
            for(int u:ls[i]){
                set.add(f[u]);
            }
        }        
        out.println(ans);
/****************************************Solution Ends**************************************************/
        clr();
    }
    static void clr(){
        out.flush();
        out.close();
    }
    static void nl() throws Exception{
        pptr=0;
        st=br.readLine().split(" ");
        pptrmax=st.length;
    }
    static void nls() throws Exception{
        pptr=0;
        st=br.readLine().split("");
        pptrmax=st.length;
    }
    static int pi() throws Exception{
        if(pptr==pptrmax)
            nl();
        return Integer.parseInt(st[pptr++]);
    }
    static long pl() throws Exception{
        if(pptr==pptrmax)
            nl();
        return Long.parseLong(st[pptr++]);
    }
    static double pd() throws Exception{
        if(pptr==pptrmax)
            nl();
        return Double.parseDouble(st[pptr++]);
    }
    static String ps() throws Exception{
        if(pptr==pptrmax)
            nl();
        return st[pptr++];
    }
/***************************************Precision Printing**********************************************/
    static void printPrecision(double d){
        DecimalFormat ft = new DecimalFormat("0.00000000000"); 
        out.println(ft.format(d));
    }
/**************************************Bit Manipulation**************************************************/
    static int countBit(long mask){
        int ans=0;
        while(mask!=0){
            mask&=(mask-1);
            ans++;
        }
        return ans;
    }
/******************************************Graph*********************************************************/
    static void Makegraph(int n){
        graph=new ArrayList[n];
        for(int i=0;i<n;i++)
            graph[i]=new ArrayList<>();
    }
    static void addEdge(int a,int b){
        graph[a].add(b);
    }
    // static void addEdge(int a,int b,int c){
    //     graph[a].add(new Pair(b,c));
    // }    
/*********************************************PAIR********************************************************/
    static class Pair{
        int u;
        int v;
        public Pair(int u, int v) {
            this.u = u;
            this.v = v;
        }
        public int hashCode() {
            int hu = (int) (u ^ (u >>> 32));
            int hv = (int) (v ^ (v >>> 32));
            return 31 * hu + hv;
        }
        public boolean equals(Object o) {
            Pair other = (Pair) o;
            return u == other.u && v == other.v;
        }
        public String toString() {
            return "[u=" + u + ", v=" + v + "]";
        }
    }
/******************************************Long Pair*******************************************************/
    static class Pairl{
        long u;
        long v;
        public Pairl(long u, long v) {
            this.u = u;
            this.v = v;
        }
        public int hashCode() {
            int hu = (int) (u ^ (u >>> 32));
            int hv = (int) (v ^ (v >>> 32));
            return 31 * hu + hv;
        }
        public boolean equals(Object o) {
            Pairl other = (Pairl) o;
            return u == other.u && v == other.v;
        }
        public String toString() {
            return "[u=" + u + ", v=" + v + "]";
        }
    }
/*****************************************DEBUG***********************************************************/
    public static void debug(Object... o){
        System.out.println(Arrays.deepToString(o));
    }
/************************************MODULAR EXPONENTIATION***********************************************/
    static long modulo(long a,long b,long c){
        long x=1,y=a%c;
        while(b > 0){
            if(b%2 == 1)
                x=(x*y)%c;
            y = (y*y)%c;
            b = b>>1;
        }
        return  x%c;
    }
/********************************************GCD**********************************************************/
    static long gcd(long x, long y){
        if(x==0)
            return y;
        if(y==0)
            return x;
        long r=0, a, b;
        a = (x > y) ? x : y; 
        b = (x < y) ? x : y;
        r = b;
        while(a % b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
}