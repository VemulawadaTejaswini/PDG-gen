import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x,cou=0;
        while(true){
            n = sc.nextInt();
            x = sc.nextInt();
            if(n==0){
                break;
            }
            cou=0;

            for(int i=1;i<n-1;i++){
                for(int l=i+1;l<n;l++){
                    for(int k=l+1;k<=n;k++){
                        if(i+l+k==x){
                            //System.out.println(i+" "+l+" "+k);
                            cou++;
                        }
                    }
                }
            }

            System.out.println(cou);
        }
        sc.close();
    }
}
