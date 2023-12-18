import java.util.Scanner;
class Main {
    public void kami(){
                Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 && y != 0){
			if(x > y){
				int work = x;
				x = y;
				y = work;
				System.out.println(x + " " + y);
				
				x = sc.nextInt();
				y = sc.nextInt();
			}else{
				System.out.println(x + " " + y);
				x = sc.nextInt();
				y = sc.nextInt();
			}
		}

    }
	public static void main(String[] args) {
    new Main().kami();
	}

}