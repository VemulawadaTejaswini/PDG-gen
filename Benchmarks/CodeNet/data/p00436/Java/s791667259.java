import java.util.Scanner;

class Main{


	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int[] data = new int[scan.nextInt()*2];
		int known = scan.nextInt();

		for(int i=0;i<data.length;i++){
			data[i]=i+1;	
		}

		boolean rihul =false;

		while(scan.hasNext()){
			int key = scan.nextInt();		

			if(key==0){
				key=data.length/2;	
				rihul = true;
			}

			int[] a = new int[key];
			int[] b = new int[data.length-key];

			for(int i=0;i<key;i++){
				a[i]=data[i];
			}
			for(int i=key;i<data.length;i++){
				b[i-key]=data[i];
			}

			if(rihul){
				for(int i=0;i<data.length;i++){
					if(i%2==0){
						data[i]=a[i/2];
					}
					else{
						data[i]=b[i/2];
					}
				}


				rihul=false;
			}
			else{
				for(int i=0;i<b.length;i++){
					data[i]=b[i];
				}
				for(int i=0;i<a.length;i++){
					data[i+b.length] = a[i];
				}


			}

		}
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}

	}			

}