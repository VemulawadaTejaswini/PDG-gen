import java.util.Scanner;

class Main{



    public static void main(String[] a){


        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {


	        	int z = sc.nextInt();
	        	int y = sc.nextInt();

	        	int ans = z + y;
	        	String ansSt = String.valueOf(ans);
	        	int ansK = ansSt.length();
	        	System.out.println(ansK);

        }

        sc.close();


     }




}