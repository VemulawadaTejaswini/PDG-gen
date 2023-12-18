import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 0;
        int i = 0;
        for(;;){
            int n = sc.nextInt();
            if(n==0){
                System.exit(0);
            }else{
                int p[] = new int[n]; 
                p[0]= sc.nextInt();
                for(i=1;i<n;i++){
                    p[i] = sc.nextInt();
                    if((p[i-1]+1)==p[i]){
                    }else{
                        if(p[f]==p[i-1]){
                            System.out.print(p[i-1]+" ");
                            f=i;
                        }else{
                            System.out.print(p[z]+"-"+p[i-1]+" ");
                            f=i;
                        }
                    }
                }
                if(a[f]==a[i-1]){
                    System.out.print(a[i-1]);
                }else{
                    System.out.print(a[z]+"-"+a[i-1]);
                }
                    System.out.print("\n");
                f=0;
            }
        }
    }
 
}