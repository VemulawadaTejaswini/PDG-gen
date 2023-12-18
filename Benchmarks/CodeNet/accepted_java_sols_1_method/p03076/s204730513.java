import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[]=new int[5];
		int b[]=new int[5];
		int total=0;
		int min=10;

		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}

		for(int i=0;i<5;i++){
			if(a[i]>=1 && a[i]<=10){
				b[i]=10;
				if(min>a[i]){
					min=a[i];
				}
			}else if(a[i]>=11 && a[i]<=20){
				b[i]=20;
				if(min>a[i]-10){
					min=a[i]-10;
				}
			}else if(a[i]>=21 && a[i]<=30){
				b[i]=30;
				if(min>a[i]-20){
					min=a[i]-20;
				}
			}else if(a[i]>=31 && a[i]<=40){
				b[i]=40;
				if(min>a[i]-30){
					min=a[i]-30;
				}

			}else if(a[i]>=41 && a[i]<=50){
				b[i]=50;
				if(min>a[i]-40){
					min=a[i]-40;
				}
			}else if(a[i]>=51 && a[i]<=60){
				b[i]=60;
				if(min>a[i]-50){
					min=a[i]-50;
				}
			}else if(a[i]>=61 && a[i]<=70){
				b[i]=70;
				if(min>a[i]-60){
					min=a[i]-60;
				}
			}else if(a[i]>=71 && a[i]<=80){
				b[i]=80;
				if(min>a[i]-70){
					min=a[i]-70;
				}
			}else if(a[i]>=81 && a[i]<=90){
				b[i]=90;
				if(min>a[i]-80){
					min=a[i]-80;
				}
			}else if(a[i]>=91 && a[i]<=100){
				b[i]=100;
				if(min>a[i]-90){
					min=a[i]-90;
				}
			}else if(a[i]>=101 && a[i]<=110){
				b[i]=110;
				if(min>a[i]-100){
					min=a[i]-100;
				}
			}else if(a[i]>=111 && a[i]<=120){
				b[i]=120;
				if(min>a[i]-110){
					min=a[i]-110;
				}
			}else if(a[i]>=121 && a[i]<=130){
				b[i]=130;
				if(min>a[i]-120){
					min=a[i]-120;
				}
			}
		}

		for(int i=0;i<5;i++){
			total+=b[i];
		}
		System.out.println(total-(10-min));

	}
}
