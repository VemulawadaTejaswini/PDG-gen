import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        int r2=(int)Math.pow(Integer.parseInt(st.nextToken()),2);
        for(int i=0;i<=w;i++){
            if((Math.pow(x-i,2))+Math.pow(y-0,2)<r2){
                System.out.println("No");
                System.exit(0);
            }
        }for(int i=0;i<=h;i++){
            if((Math.pow(x-w,2))+Math.pow(y-i,2)<r2){
                System.out.println("No");
                System.exit(0);
            }
        }for(int i=w;i>=0;i++){
            if((Math.pow(x-i,2))+Math.pow(y-h,2)<r2){
                System.out.println("No");
                System.exit(0);
            }
        }for(int i=h;i>=0;i++){
            if((Math.pow(x-0,2))+Math.pow(y-h,2)<r2){
                System.out.println("No");
                System.exit(0);
            }
        }System.out.println("Yes");
    }
}