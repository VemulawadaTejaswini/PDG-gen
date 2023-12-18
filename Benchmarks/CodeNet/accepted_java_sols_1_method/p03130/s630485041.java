import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="";
        for(int i=0;i<6;i++){
            str+=sc.next();
        }
        if(str.replaceAll("1","").length()>=4&&str.replaceAll("2","").length()>=4&&str.replaceAll("3","").length()>=4&&str.replaceAll("4","").length()>=4){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        

    }

}