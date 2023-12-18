import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	List<String> direc = new ArrayList<String>();
	direc.add("RIGHT");
	direc.add("LEFT");

	int n,m;
	n = sc.nextInt();
	while(n!=0){
	    int posX = 1;
	    int posY = 1;
	    int nowDirec = 0;

	    m = sc.nextInt();

	    while(true){
		String instruct = sc.next();
		if(instruct.equals("STOP")){break;}
		if(direc.contains(instruct)){
		    if(instruct.equals(direc.get(0))){nowDirec++; nowDirec%=4;}
		    else {
			nowDirec--; 
			if(nowDirec==-1){nowDirec = 3;}
		    }
		}
		else{
		    int step = sc.nextInt();
		    if(instruct.equals("BACKWARD")){step = -step;}
		    if(nowDirec==0){
			posY+=step;
			if(posY>m){posY=m;}
			if(posY<1){posY=1;}
		    }
		    else if(nowDirec==1){
			posX+=step;
			if(posX>n){posY=n;}
			if(posX<1){posY=1;}
		    }
		    else if(nowDirec==2){
			posX-=step;
			if(posY>m){posY=m;}
			if(posY<1){posY=1;}
		    }
		    else if(nowDirec==3){
			posY-=step;
			if(posX>n){posY=n;}
			if(posX<1){posY=1;}
		    }
		}
	    }

	    System.out.println(posX+" "+posY);

	    n = sc.nextInt();
	}
    }
}