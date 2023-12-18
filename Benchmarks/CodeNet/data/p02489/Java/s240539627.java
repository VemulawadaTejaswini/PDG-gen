public class Main {


	public static void main(String[] args) {

	int x = 1;
	int i = 1;

     while(x != 0){



		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if(x == 0){
			break;
		}
		System.out.println("Case" + i + ":" + x);
		i++;

     }

	}

}