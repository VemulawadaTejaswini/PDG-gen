import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2[] = new String[str1.length()];
        boolean flag = true;
        for(int i = 0 ; i < str1.length() ; i++){
            str2[i] = str1.substring(i,i+1);
            if (i % 2 == 0 && !str1.substring(i,i+1).equals("R") && !str1.substring(i,i+1).equals("U") && !str1.substring(i,i+1).equals("D")){
                flag = false;
            } 
            else if(i % 2 == 1 && !str1.substring(i,i+1).equals("L") && !str1.substring(i,i+1).equals("U") && !str1.substring(i,i+1).equals("D")){
                flag = false;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
