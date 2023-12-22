import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
      	String line = sc.next();
      	String[] mozi = line.split("");
      	String output = "";

      	if (mozi.length > count){
          	for(int i=0; i<count; i++){
          		output += mozi[i];
        	}
			output += "...";
        }else{
            for(int i=0; i<mozi.length; i++){
          		output += mozi[i];
        	}
        }
        System.out.println(output);
    }

}