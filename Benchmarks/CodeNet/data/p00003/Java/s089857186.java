Class Tenmou{
    public static void main (String[] args) {

	int n;
	int a,b,c;
	int a[3];
	string str[];
	
	n = Integer.parseInt(br.readLine());
	str[]=new str[n];
	for(int i=0;i<n;i++){

	a = Integer.parseInt(br.readLine());
	b = Integer.parseInt(br.readLine());
	c = Integer.parseInt(br.readLine());

	a[0]=max(a,b,c);
	if(a[0]==a){
		a[1]=b;
		a[2]=c;
	}elseif(a[0]==b){
		a[1]=a;
		a[2]=c;
	}elseif(a[0]==c){
		a[1]=b;
		a[2]=a;
	}
	if(a[0]^2==a[1]^2+a[2]^2){
		str[i]="YES";
	}else{
		str[i]="NO";
	}
	}

	for(int i=0;i<n;i++){
				System.out.println(str[i]);
	}
    }
}
}