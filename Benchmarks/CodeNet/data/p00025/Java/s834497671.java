import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int[] sel = new int[4];
    	int[] esel = new int[4];
    	for(int i = 0 ; i < 4 ; i ++){
    		sel[i]=scan.nextInt();
    	}
    	Data d = new Data(sel);
    	while(scan.hasNext()){
    		for(int i = 0 ; i < 4 ; i ++){
    			esel[i] = scan.nextInt();
    		}
    		d.check(esel);
    	}
    }
}
class Data{
	private int[] select = new int[4];
	Data(int[] sel){
		select=sel;
	}
	void check(int[] esel){
		int hit = 0;
		int blow = 0;
		for(int i = 0; i < 4 ; i++){
			if(select[i]==esel[i]){
				hit++;
			}
		}
		for(int i = 0 ; i < 3 ; i ++){
			for(int j = i+1 ; j < 4 ; j++){
				if(i==j) continue;
				if(select[i]==esel[j]){
					blow++;
				}
			}
		}
		System.out.println(hit+" "+blow);
	}
}