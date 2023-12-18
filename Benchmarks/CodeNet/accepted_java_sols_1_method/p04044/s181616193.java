import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
      	int l = sc.nextInt();
      	String words[] = new String[n];
      
      	for(int i = 0;i < n;i++) words[i] = sc.next();
        Arrays.sort(words);
        
          
        for(int i = 0;i < n;i++) System.out.print(words[i]);
        System.out.println();
      
	}
}