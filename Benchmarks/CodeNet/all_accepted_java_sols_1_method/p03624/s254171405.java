import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = a.split("");
        Set<String> set = new TreeSet<>();
        for(int i = 0;i<a.length();i++){
            set.add(b[i]);
        }


        String answer = "";
        int flag = 0;
        String[] A = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(int i = 0;i<A.length;i++){
            if(set.contains(A[i]) != true){
                answer = A[i];
                flag++;
                break;
            }
        }
        if(flag == 0){
            System.out.println("None");
        }else{
            System.out.println(answer);
        }
    }
}