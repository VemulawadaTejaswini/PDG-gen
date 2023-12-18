import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i,j,a,l;
        String str1,str2=" ",str3=" ";
        for(i=0; ;i++){
            str1=sc.next();
            l=str1.length();
            if(str1.equals("-")){
                break;
            }else{
                n=sc.nextInt();
                for(j=1;j<=n;j++){
                    a=sc.nextInt();
                    str2=str1.substring(0,a);
                    str3=str1.substring(a,l);
                    str1=str3+str2;
                }
            }
            System.out.println(str1);
        }
    }
}
