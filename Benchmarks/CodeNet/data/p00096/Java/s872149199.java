import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    int[] di;
    int[] tetra;

    void run(){
	di = new int[4000+1];
	tetra = new int[4000+1];
	setDi();
	setTetra();
	while(sc.hasNext()){
	    n = sc.nextInt();
	    System.out.println(tetra[n]);
	}
    }

    void setDi(){
	for(int i=0; i<=1000; i++)
	    for(int k=0; k<=1000; k++)
		di[i+k]++;
    }

    void setTetra(){
	for(int i=0; i<di.length; i++)
	    for(int k=0; k<di.length; k++)
		if(i+k<tetra.length)
		    tetra[i+k] += di[i]*di[k];
    }
}
	    