import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		String[] kaikyu=new String[11];
		float[] jyougen=new float[11];


		kaikyu[0]="light fly";
		kaikyu[1]="fly";
		kaikyu[2]="bantam";
		kaikyu[3]="feather";
		kaikyu[4]="light";
		kaikyu[5]="light welter";
		kaikyu[6]="welter";
		kaikyu[7]="light middle";
		kaikyu[8]="middle";
		kaikyu[9]="light heavy";
		kaikyu[10]="heavy";

		jyougen[0]=48.0f;
		jyougen[1]=51.0f;
		jyougen[2]=54.0f;
		jyougen[3]=57.0f;
		jyougen[4]=60.0f;
		jyougen[5]=64.0f;
		jyougen[6]=69.0f;
		jyougen[7]=75.0f;
		jyougen[8]=81.0f;
		jyougen[9]=91.0f;
		jyougen[10]=114514f;

		Scanner sc=new Scanner(System.in);
		String str="";
		float nyuryoku=0f;

		while(sc.hasNext()) {
			str=sc.next();
			nyuryoku=Float.parseFloat(str);

			for(int i=0; i<11; i++) {
				if(nyuryoku<=jyougen[i]) {
					System.out.println(kaikyu[i]);
					break;
				}
			}
		}


	}
}
