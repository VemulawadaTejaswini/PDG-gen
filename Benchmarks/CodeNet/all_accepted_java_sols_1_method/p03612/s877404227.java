import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int N=scanner.nextInt();
                boolean[] a=new boolean[N+1];
                for(int i=0;i<N;i++){
                        if(i+1==scanner.nextInt()){
                                a[i]=true;
                        }else{
                                a[i]=false;
                        }
                }

                int ans=0;
                int tmp=0;
                for(int i=0;i<N;i++){
                        if(a[i]){
                                a[i]=a[i+1]=false;
                                ans++;
                        }
                }

                System.out.println(ans);
        }
}