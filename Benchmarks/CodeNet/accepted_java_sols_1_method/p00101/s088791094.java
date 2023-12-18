import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            String str1 = sc.nextLine();
            if(str1.contains("Hoshino")){
                String str2 = str1.replace("Hoshino","Hoshina");
                System.out.println(str2);
            }else{System.out.println(str1);}

        }
    }
}
