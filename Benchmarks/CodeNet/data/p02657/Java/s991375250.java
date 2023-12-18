import java.util.*;
import java.io.*;

public class Main{
        public static void main(String[]args){
            System.out.println(process());
		}
		public static long process(){
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
            long multiple =1;
			for (int i=0;i<a;i++){
				multiple*= in.nextLong();
                if (multiple>= Math.pow(10,18)){
					return -1;
				}
			}
			return multiple;
		}
}

