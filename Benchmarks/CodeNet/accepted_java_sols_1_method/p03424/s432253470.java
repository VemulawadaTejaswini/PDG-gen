import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<n; i++){
            String s = sc.next();
            set.add(s);
        }
        if(set.size()==3){
            System.out.println("Three");
        }else{
            System.out.println("Four");
        }
    }
}
