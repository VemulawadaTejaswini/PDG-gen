import java.util.*;
public class Main {
	public static void main(String[] args){

	Scanner sc= new Scanner (System.in);
	int z;
	double x;
	double y;
	double i[];
	i = new double[6];

	while(sc.hasNext()){
		for(int n=0;n<6;n++){
			i[n]=sc.nextDouble();}
		if(i[0]==i[3]){
	double b=i[1]-i[4];
			double c=i[2]-i[5];
			y =c / b;
			x = (y * i[1] * -1) + i[2];
			System.out.println(x+" "+y);

		}
		if(i[0]<0){
			for(int m=0;m<3;m++){
				i[m] -=i[m];
			}
		}
		if(i[3]<0){
			for(int m=3;m<6;m++){
				i[m] -=i[m];
			}
		}
		if(i[0] < i[3]){
			for( z=0;z<3;z++){
				i[z]=i[z]*2;
			}

		}
		if(i[0]>i[3]){
			for(z=3;z<6;z++){
				i[z]=i[z]*2;
			}
		}
	}

}
}