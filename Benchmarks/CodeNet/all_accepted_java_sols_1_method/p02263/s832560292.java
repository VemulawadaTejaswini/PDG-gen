import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String po=s.nextLine();
        char a[]=po.toCharArray();
        int i=0,tmp=0,check=0;
        int b[]=new int[200];
        for(char a1 : a){
            //System.out.println(a1);
            if(a1==' '){
                if(check==1){
                    b[i]=tmp;
                    check=0;
                    i++;
                    tmp=0;
                }
            }
            else if(a1=='+'){ b[i-2]=b[i-2]+b[i-1]; i--;}
            else if(a1=='-'){ b[i-2]=b[i-2]-b[i-1]; i--;}
            else if(a1=='*'){ b[i-2]=b[i-2]*b[i-1]; i--;}
            else {
                if(check==1){
                    tmp=tmp*10+a1-'0';
                }else{
                    tmp=a1-'0';
                }
                check=1;
            }
        }
        System.out.println(b[0]);
    }
}
