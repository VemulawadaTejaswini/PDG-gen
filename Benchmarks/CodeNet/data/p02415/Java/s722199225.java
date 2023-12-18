import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String word = sc.next();
        String array = "";
        String array_cp = "";
        array = sc.nextLine();
        for(int i=0;i<array.length();i++){
            if(Character.isUpperCase(array.charAt(i))){
                array_cp +=  array.substring(i,i+1).toLowerCase();
            }else if(Character.isLowerCase(array.charAt(i))){
                array_cp +=  array.substring(i,i+1).toUpperCase();
            }else{
                array_cp +=  array.substring(i,i+1);
            }
        }
        System.out.println(array_cp);
        sc.close();
    }
}
