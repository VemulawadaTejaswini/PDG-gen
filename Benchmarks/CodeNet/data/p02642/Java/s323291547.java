import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	double[] list = new double[n];
      	for(int cnt = 0;cnt < list.length;cnt++){
          	list[cnt] = sc.nextDouble();
        }
      	int count = 0;
      	int save = 0;
      	for(int i = 0;i < list.length;i++){
          	save = 0;
        	for(int j = 0;j < list.length;j++){
            	if(i == j){
                	continue;
                }
              	if(list[i] % list[j] != 0.0){
                	save++;
                }
            }
          	if(save == n - 1){
            	count++;
            }
        }
      	System.out.println(count);
	}
}