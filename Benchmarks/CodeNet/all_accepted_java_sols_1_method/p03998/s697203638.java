import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String[] str=new String[3];
        int[] length=new int[3];
        int i=0,j=0;

        for(i=0;i<3;i++){
            str[i]=scan.next();
            length[i]=str[i].length();
        }
        int a=0,b=0,c=0;
        char work;
        work=str[0].charAt(0);
        length[0]--;
        a++;

        while(1==1){
            if(work=='a'){
                if(length[0]==0){
                    System.out.println("A");
                    return;
                }
                work=str[0].charAt(a);
                length[0]--;
                a++;
            }
            else if(work=='b'){
                if(length[1]==0){
                    System.out.println("B");
                    return;
                }
                work=str[1].charAt(b);
                length[1]--;
                b++;
            }
            else if(work=='c'){
                if(length[2]==0){
                    System.out.println("C");
                    return;
                }
                work=str[2].charAt(c);
                length[2]--;
                c++;
            }
        }
    
    }
}