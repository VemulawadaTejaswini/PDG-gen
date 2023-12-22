import java.util.*;

class Main {
    public static void main(String[] args) {
	   int i = 0;
	   int j;
        Scanner sc = new Scanner(System.in);
		String b = sc.next();			
	   String[] enki;
	   enki = new String[4];
	   enki[0] = "A";
	   enki[1] = "C";
	   enki[2] = "G";
	   enki[3] = "T";
	   for(i = 0;!(b.equals(enki[i])); i++){
	   }
		j = 3-i;	
	   System.out.println(enki[j]);
    }
}