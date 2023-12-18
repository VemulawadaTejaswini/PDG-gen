import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().replace("BC","a");
        String[] s2=s.split("",0);
        long count=0;
        int as=0;
        for(int i=s2.length-1;i>=0;i--){
            if(s2[i].equals("a")){
                as++;
            }
            else if(s2[i].equals("A")){
                
                count+=as;
            }
            else{
                as=0;
            }
        }
        System.out.println(count);
    }
}
