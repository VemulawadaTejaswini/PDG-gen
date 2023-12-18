
class Main{

public static void main (String[] args) {

	java.util.Scanner sc = new java.util.Scanner(System.in);

	int N = sc.nextInt();

	int kosuu [] = new int [4];

	for (int i=0; i<N; i++) {
		String temp = sc.next();
		if (temp.equals("AC")) {
			kosuu[0]++;
		} else if (temp.equals("WA")) {
			kosuu[1]++;
		} else if (temp.equals("TLE")) {
			kosuu[2]++;
		} else {
			kosuu[3]++;
		}
	}

	System.out.print("AC x ");
	System.out.println(kosuu[0]);
	System.out.print("WA x ");
	System.out.println(kosuu[1]);
	System.out.print("TLE x ");
	System.out.println(kosuu[2]);
	System.out.print("RE x ");
	System.out.println(kosuu[3]);

	sc.close();;

}


}

