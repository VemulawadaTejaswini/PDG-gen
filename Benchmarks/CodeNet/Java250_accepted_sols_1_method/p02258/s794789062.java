import java.io.*;

class Main{
        private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        public static void main(String[] args) throws IOException{
                int n = Integer.parseInt(br.readLine());
                int[] A = new int[n];
                int max = 0;
                int dis = 0;
                for(int i=0; i<n; i++)
                        A[i] = Integer.parseInt(br.readLine());
                dis = A[n-1]-A[n-2];
                for(int i=n-1; i>0; i--){
                        if(A[i] > max){
                                max = A[i];
                                for(int j=i-1; j>=0; j--){
                                        int t = A[i]-A[j];
                                        if(t>dis)
                                                dis = t;
                                }
                        }
                }
                System.out.println(dis);
        }
}