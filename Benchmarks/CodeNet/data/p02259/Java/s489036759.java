import java.util.Scanner;

class Main{
       public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = 0;
		int tmp = 0;
		int i,j;
		int count = 0;

		int [] sort = new int[N];

		for(i=0; i<sort.length; i++){
			x = sc.nextInt();
			sort[i] = x;
		}

		for(i=0; i<sort.length-1; i++){
		        for(j=i+1; j<sort.length; j++){
                                if(sort[i] > sort[j]){
					tmp = sort[j];
					sort[j] = sort[i];
					sort[i] = tmp;
					count ++;
				}
			}
		}
		
                for(i=0; i<sort.length; i++){
                      System.out.print(sort[i]);
                      System.out.print(' ');
                }
                      System.out.print("\n");
                      System.out.println(count);

       }
}
