import java.util.Scanner;


class Main {

	public static void main(String[] args) {   

		Scanner scanner = new Scanner(System.in);

		String str =scanner.nextLine();
		int q = Integer.parseInt(scanner.nextLine());


		char[] cha; 
		cha=new char[str.length()];

		char[] cha2;
		cha2=new char[str.length()];

		char[] cha3;
		cha3=new char[str.length()];



		for(int i=0;i < str.length();i++){//

			cha[i]=str.charAt(i);
		}



		for(int i=0;i<q;i++){

			String order =scanner.next();

			if(order.equals("print")){

				int a= Integer.parseInt(scanner.next());
				int b= Integer.parseInt(scanner.next());
				for(int r=a;r<b+1;r++){

					System.out.print(String.valueOf(cha[r]));
					if(r == b){
						System.out.println("");
					}
				}
			}


			else if(order.equals("reverse")){
				int counter=0;
				int a1=Integer.parseInt(scanner.next());
				int b1=Integer.parseInt(scanner.next());
				counter=b1;
				for(int t=0;t<str.length();t++){
					cha2[t]=cha[t];
				}
				for(int t=a1;t<b1+1;t++){

					cha2[t]=cha[counter];;
					counter = counter-1;
				}
				for(int t=0;t < str.length();t++){
					cha[t]=cha2[t];
				}
			}


			else if(order.equals("replace")){
                int counter2=0;
				int a2=Integer.parseInt(scanner.next());
				int b2=Integer.parseInt(scanner.next());
				String p=scanner.next();
				for(int k=0;k<p.length();k++){
					cha3[k]=p.charAt(k);
				}
				
				for(int k=a2;k<b2+1;k++){
					cha[k]=cha3[counter2];
					counter2=counter2+1;
				}
			}


		}
		scanner.close();
	}
}

