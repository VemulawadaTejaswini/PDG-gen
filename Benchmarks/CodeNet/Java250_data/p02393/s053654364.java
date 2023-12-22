import java.util.Scanner;
public class Main{

    int a,b,c;
    int[] data;
    int size = 3;

    public void input(){
	Scanner scan = new Scanner(System.in);
        data = new int[3];
	for ( int i = 0; i < 3; i++ ){
	    data[i] = scan.nextInt();
	}
    }
 
    public void selsort(){
	for (int front = 0;front < size - 1;front++){

	    int minIndex = front;
            for (int j = front + 1;j < size;j++){
		if (data[j] < data[minIndex]){
                    minIndex = j;
		}
	    }
  
	    int tmp = data[front];
            data[front] = data[minIndex];
            data[minIndex] = tmp;
	}
    }

    public void output(){
	System.out.println(data[0]+" "+data[1]+" "+data[2]);

      
    }
 public static void main(String[] args){
     Main p = new Main();
     p.input();
     p.selsort();
     p.output();
 }
}
  