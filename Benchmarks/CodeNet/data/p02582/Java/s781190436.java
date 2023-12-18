import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        String S=sc.next();
        if(S.equals("RRR")) System.out.println(3);
        else if(S.equals("RSR")||S.equals("RSS")||S.equals("SSR")||S.equals("SRS")) System.out.println(1);
      	else if(S.equals("SSS")) System.out.println(0);
        else System.out.println(2);
    }
}
