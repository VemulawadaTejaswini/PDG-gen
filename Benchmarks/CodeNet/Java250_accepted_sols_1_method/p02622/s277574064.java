import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
		String T = sc.next();
      
      	String[] Sarray = S.split("");
      	String[] Tarray = T.split("");
      
      	int count = 0;
      	for (int i=0; i<Sarray.length; i++){
          	if (!Sarray[i].equals(Tarray[i])){
              	count += 1;
            }
        }
        
        System.out.println(count);
    }
}