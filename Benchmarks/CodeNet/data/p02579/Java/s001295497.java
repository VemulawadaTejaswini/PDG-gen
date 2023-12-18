
import java.io.*;
import java.util.*;

import java.util.logging.Logger;

import static java.lang.System.*;

public class WizardInMaza{
    static BufferedReader br;
    static  long mod  = 998244353;
    static HashSet<Integer> p  = new HashSet<>();
  static   protected int a = 9;
 static    protected int b =10;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        int testcCase = 1;

           int[] nm =readArray(2,0,0);
           int[] ss= readArray(2,0,0);
           int[] dd = readArray(2,0,0);
                a=nm[0];b= nm[1];
           int[][] grid  =new int[nm[0]][nm[1]];


           for(int i=0;i<nm[0];i++){
               char[] ar =cin().toCharArray();
               for(int j=0;j<nm[1];j++){
                   if(ar[j]=='.'){
                       grid[i][j]=1;
                   }
                   else{
                       grid[i][j]=0;
                   }
               }
           }
           ArrayDeque<Integer> sx = new ArrayDeque<>();

           ArrayDeque<Integer> sy  =new ArrayDeque<>();
           int ix = ss[0]-1;
           int iy = ss[1]-1;

           sx.addFirst(ix);sy.addFirst(iy);

           int[] dx = {-1,1,0,0};
           int[] dy = {0,0,1,-1};
            int[][] dist = new int[nm[0]][nm[1]];
           for(int i=0;i<nm[0];i++){

               Arrays.fill(dist[i],Integer.MAX_VALUE);
           }
            dist[ix][iy]=0;
           while (sx.isEmpty()==false){

               int i =sx.removeFirst();int j=sy.removeFirst();

               for(int k=0;k<4;k++){
                   int newx = i+dx[k];int newy =j+dy[k];
                   if(legal(newx,newy,grid)==true){
                       if(dist[newx][newy]>dist[i][j]) {
                           dist[newx][newy] = dist[i][j];
                               sx.addFirst(newx);sy.addFirst(newy);
                       }
                   }
               }

               for(int k =i-2;k<=i+2;k++){


                   for(int l = j-2;l<=j+2;l++){
                    //   System.out.println(k+" "+l+" "+i+" "+j);

                       if(legal(k,l,grid)==true){
                           if(dist[k][l]>dist[i][j]+1){
                               dist[k][l]=dist[i][j]+1;
                               sx.addLast(k);sy.addLast(l);
                           }
                       }
                   }
               }
           }
        System.out.println(dist[dd[0]-1][dd[1]-1]==Integer.MAX_VALUE?-1:dist[dd[0]-1][dd[1]-1]);











    }

    public static boolean legal(int x,int y,int[][] grid){

        if(x<0 || x>=a || y<0 || y>=b){

         return false;

        }
        if(grid[x][y]==1){
            return true;
        }
        else{
            return false;
        }

    }












    public static long min(long a,long b) {
        return Math.min(a,b);
    }
    public static int min(int a,int b) {
        return Math.min(a,b);
    }
    public  static  int[] readArray(int n,int x ,int z)throws Exception{
        int[] arr= new int[n];
        //   System.out.println(arr.length);
        String[] ar= cinA();
        for(int i =x ;i<n;i++){
            //   System.out.println(i-x);
            //  int  y  =getI(ar[i-x]);
            arr[i]=getI(ar[i-x]);
        }
        return arr;
    }
    public  static  long[] readArray(int n,int x )throws Exception{
        long[] arr= new long[n];
        String[] ar= cinA();
        for(int i =x ;i<n+x;i++){
            arr[i]=getL(ar[i-x]);
        }
        return arr;
    }

    public static void arrinit(String[] a,long[] b)throws Exception{
        for(int i=0;i<a.length;i++){
            b[i]=Long.parseLong(a[i]);
        }
    }
    public  static HashSet<Integer>[]  Graph(int n,int edge,int directed)throws Exception{
        HashSet<Integer>[] tree=  new HashSet[n];

        for(int j=0;j<edge;j++){

            String[] uv = cinA();
            int u = getI(uv[0]);
            int v = getI(uv[1]);
            if(directed==0){

                tree[v].add(u);
            }
            tree[u].add(v);
        }
        return tree;
    }
    public static void arrinit(String[] a,int[] b)throws Exception{
        for(int i=0;i<a.length;i++){
            b[i]=Integer.parseInt(a[i]);
        }
    }
    static double findRoots(int a, int b, int c) {
        // If a is 0, then equation is not
        //quadratic, but linear


        int d = b * b - 4 * a * c;
        double sqrt_val = Math.sqrt(Math.abs(d));


        // System.out.println("Roots are real and different \n");

        return Math.max((double) (-b + sqrt_val) / (2 * a),
                (double) (-b - sqrt_val) / (2 * a));


    }

    public static String cin() throws Exception {
        return br.readLine();
    }

    public static String[] cinA() throws Exception {
        return br.readLine().split(" ");
    }
    public static String[] cinA(int x) throws Exception{
        return br.readLine().split("");
    }

    public static String ToString(Long x) {
        return Long.toBinaryString(x);
    }

    public static void cout(String s) {
        System.out.println(s);
    }

    public static Integer cinI() throws Exception {
        return Integer.parseInt(br.readLine());
    }

    public static int getI(String s) throws Exception {
        return Integer.parseInt(s);
    }

    public static long getL(String s) throws Exception {
        return Long.parseLong(s);
    }

    public static long max(long a, long b) {
        return Math.max(a, b);
    }
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static void coutI(int x) {
        System.out.println(String.valueOf(x));
    }

    public static void coutI(long x) {
        System.out.println(String.valueOf(x));
    }

    public static Long cinL() throws Exception {
        return Long.parseLong(br.readLine());
    }

    public static void arrInit(String[] arr, int[] arr1) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = getI(arr[i]);
        }

    }
}
