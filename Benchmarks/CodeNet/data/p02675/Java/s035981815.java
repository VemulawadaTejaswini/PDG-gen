class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		n = n % 10;
		if(n==3){
			System.out.println("bon");
		}else if(n==0||n==1||n==6||n==8){
			System.out.println("pon");
		}else{
			System.out.println("hon");
		}
	}
}