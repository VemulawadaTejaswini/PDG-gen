import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
		String str = sc.next();
        
        String[] word = str.split("");
        
        int count = 1;
        String current = word[0];
        
        for(int i = 1; i < N; i++){
            if(word[i].equals(current)){
                continue;
            }else{
                count++;
                current = word[i];
            }
        }
      	System.out.println(count);
    }
}