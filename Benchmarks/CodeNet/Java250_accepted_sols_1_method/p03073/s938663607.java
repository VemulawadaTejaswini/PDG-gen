import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner scan=new Scanner (System.in);
        String a=scan.next();
        int b=a.length();
        char c[]=new char[b];
        int ans1=0;
        int ans2=0;
        StringBuilder sb1 = new StringBuilder(a);

        for(int i=0;i<b;i++){
            c[i]=sb1.charAt(i);
        }
        int d=0;
        for(int i=0;i<b;i++){
            d=i%2;
            if(d==0){
                if(c[i]!='0'){
                    ans1+=1;
                }
            }else{
                if(c[i]!='1'){
                    ans1+=1;
                }
            }
        }

        d=0;
        for(int i=0;i<b;i++){
        	d=i%2;
            if(d==0){
                if(c[i]!='1'){
                    ans2+=1;
                }
            }else{
                if(c[i]!='0'){
                    ans2+=1;
                }
            }
        }
        if(ans1>ans2){
            System.out.println(ans2);
        }else{
            System.out.println(ans1);
        }


    }
}