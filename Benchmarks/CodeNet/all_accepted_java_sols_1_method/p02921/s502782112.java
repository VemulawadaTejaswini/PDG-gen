import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String Line1=reader.readLine();
        String Line2=reader.readLine();
      	char tmp1[],tmp2[];
      	tmp1 = new char[3];
      	tmp2 = new char[3];
     	int count = 0;
		for(int i=0; i<3; i++){
			tmp1[i] = Line1.charAt(i);
          	tmp2[i] = Line2.charAt(i);
			if(tmp1[i] == tmp2[i]){
			count ++;
			}
		}
		System.out.println(count);
	}
}