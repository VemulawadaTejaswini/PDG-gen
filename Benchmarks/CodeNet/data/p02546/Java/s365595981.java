import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

class Solution{
    static Utility.FastReader fr=new Utility.FastReader();
    static PrintWriter out=new PrintWriter(System.out);

    public static void main(String[] args){
        int t=1;
        while(t-->0){
            String s=fr.nextLine();
            if(s.charAt(s.length()-1)=='s')
                System.out.println(s.substring(0, s.length())+"es");
            else
                System.out.println(s+"s");
        }
        out.close();
    }


    static void debug(Object... o){
        System.err.println(Arrays.deepToString(o));
    }

    static class Utility{
        static void sort(int[] a){
            ArrayList<Integer> list=new ArrayList<>();
            for(int i: a) list.add(i);
            Collections.sort(list);
            for(int i=0;i<a.length;i++) a[i]=list.get(i);
        }

        static void shuffleArray(long[] arr){
            int n=arr.length;
            Random rnd=new Random();
            for(int i=0;i<n;++i){
                long tmp=arr[i];
                int randomPos=i+rnd.nextInt(n-i);
                arr[i]=arr[randomPos];
                arr[randomPos]=tmp;
            }
        }

        static void shuffleArray(int[] arr){
            int n=arr.length;
            Random rnd=new Random();
            for(int i=0;i<n;++i){
                int tmp=arr[i];
                int randomPos=i+rnd.nextInt(n-i);
                arr[i]=arr[randomPos];
                arr[randomPos]=tmp;
            }
        }

        static int gcd(int a,int b){
            if(b==0)
                return a;
            return gcd(b,a%b);
        }

        static long gcd(long a,long b){
            if(b==0)
                return a;
            return gcd(b,a%b);
        }

        static class FastReader{
            BufferedReader br;
            StringTokenizer st;

            public FastReader(){
                br=new BufferedReader(new
                        InputStreamReader(System.in));
            }

            String next(){
                while(st==null||!st.hasMoreElements()){
                    try{
                        st=new StringTokenizer(br.readLine());
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }

            int nextInt(){
                return Integer.parseInt(next());
            }

            long nextLong(){
                return Long.parseLong(next());
            }

            double nextDouble(){
                return Double.parseDouble(next());
            }

            String nextLine(){
                String str="";
                try{
                    str=br.readLine();
                }catch(IOException e){
                    e.printStackTrace();
                }
                return str;
            }
        }
    }
}

