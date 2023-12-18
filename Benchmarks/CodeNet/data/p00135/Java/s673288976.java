import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			for(int i = 0;i < n;i++){
				String[] time = scan.next().split(":");
				double tH = Double.parseDouble(time[0]) * 30 + Double.parseDouble(time[1])*0.5;
				double tM = Double.parseDouble(time[1]) * 6;
				double dif = Math.abs(tH - tM);
				dif = Math.min(dif,360 - dif);
				if(dif < 30){
					System.out.println("alert");
				}else if(dif >= 90 && dif <= 180){
					System.out.println("safe");
				}else{
					System.out.println("warning");
				}
			}
		}
	}
}