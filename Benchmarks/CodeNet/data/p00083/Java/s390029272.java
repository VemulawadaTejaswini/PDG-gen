import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		while(true){
			try{
				int year = sc.nextInt();
				int month = sc.nextInt();
				int day = sc.nextInt();
				int ans = 0;
				if(year > 1868){
					if(year > 1912){
						if(year > 1926){
							if(year > 1989){
								ans = 4;
							}else if (year == 1989){
								if(month > 1){
									ans = 4;
								}else if(month == 1 && day >= 8){
									ans = 4;
								}else{
									ans = 3;
								}
							}else{
								ans = 2;
							}
						}else if (year == 1926){
							if(month > 12){
								ans = 3;
							}else if(month == 12 && day >= 25){
								ans = 3;
							}else{
								ans = 2;
							}
						}else{
							ans = 2;
						}
					}else if (year == 1912){
						if(month > 7){
							ans = 2;
						}else if(month == 7 && day >= 30){
							ans = 2;
						}else{
							ans = 1;
						}
					}else{
						ans = 1;
					}
				}else if (year == 1868){
					if(month > 9){
						ans = 1;
					}else if(month == 9 && day >= 8){
						ans = 1;
					}else{
						ans = 0;
					}
				}else{
					ans = 0;
				}
				if(ans == 0){
					System.out.println("pre-meiji");
				}else if(ans == 1){
					year = year - 1867;
					System.out.println("meiji "+year+" "+month+" "+day);
				}else if(ans == 2){
					year = year - 1911;
					System.out.println("taisho "+year+" "+month+" "+day);
				}else if(ans == 3){
					year = year - 1925;
					System.out.println("showa "+year+" "+month+" "+day);
				}else if(ans == 4){
					year = year - 1988;
					System.out.println("heisei "+year+" "+month+" "+day);
				}
			}catch(Exception g){
				System.exit(0);
			}
		}
	}
    public static void main(String[] args) {
    	new Main().doIt();
    }
}