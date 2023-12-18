import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                int max=0,min=0,sum=0,ave=0;
                int a = sc.nextInt();
                if(a==0) break;
                int[] s = new int[100];
                for(int i=0;i<a;i++){
                    s[i]=sc.nextInt();
                    sum+=s[i];
                    if(i==0){
                        max=s[0];
                        min=s[0];
                    }else if(max<s[i]){
                        max=s[i];
                    }else if(min>s[i]){
                        min=s[i];
                    }
                }
                ave=(sum-max-min)/(a-2);
                System.out.println(ave);
            }
        }
    }
}
