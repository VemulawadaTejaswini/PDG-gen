import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        String s = sc.next();
        String[] line = s.split("");
		int index = sc.nextInt();
        String a = line[index-1];
        for(int i=0; i<num; i++){
          if(!line[i].equals(a)) line[i] = "*";
          System.out.print(line[i]);
        }


	}
}