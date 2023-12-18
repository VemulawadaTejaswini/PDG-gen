import java.*;
class Tenmou{
    public static void main (String[] args) {

	int n;
	int a,b,c;
	int x[];
	x= new int[3];
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	n = Integer.parseInt(br.readLine());
	string str[];
	str = new string[n];

	for(int i=0;i<n;i++){

	a = Integer.parseInt(br.readLine());
	b = Integer.parseInt(br.readLine());
	c = Integer.parseInt(br.readLine());

	x[0]=max(a,b,c);
	if(x[0]==a){
		x[1]=b;
		x[2]=c;
	}else if(x[0]==b){
		x[1]=a;
		x[2]=c;
	}else{
		x[1]=b;
		x[2]=a;
	}//if
	if(x[0]^2==x[1]^2+x[2]^2){
		str[i]="YES";
	}else{
		str[i]="NO";
	}//if
	}//for

	for(int i=0;i<n;i++){
				System.out.println(str[i]);
	}//for
}//method
}//class