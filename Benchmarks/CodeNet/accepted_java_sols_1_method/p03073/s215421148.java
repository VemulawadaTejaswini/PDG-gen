import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int num = s.length();
        String[] line = new String[num];
        line = s.split("");
        String former = line[0];
        //System.out.println(former);
        int count = 0;
        for(int i=1; i<num; i++){
          if(line[i].equals(former)){
            if(line[i].equals("0")) line[i] = "1";
            else line[i] = "0";
            former = line[i];
            count++;
          }
          else{
            former = line[i];
          }

        }
        System.out.println(count);
	}
}