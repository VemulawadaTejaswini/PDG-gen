import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            int flag=0;
            for(char c='a';c<='z';c++){
                if(s.charAt(i)==(c)){
                    c-=32;
                    System.out.print(c);
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                for(char c='A';c<='Z';c++){
                    if(s.charAt(i)==(c)){
                        c+=32;
                        System.out.print(c);
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==0) System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
