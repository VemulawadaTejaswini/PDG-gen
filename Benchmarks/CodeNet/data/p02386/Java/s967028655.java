import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int[] point = new int[6];
		int n;
		Scanner scan = new Scanner(System.in);
		Boolean allDifference = true;
		
		n=scan.nextInt();
		Dice4[] dices = new Dice4[n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<6;j++){
				point[j]=scan.nextInt();
			}
			dices[i]=new Dice4(point);
		}
		scan.close();
		
		for(int i = 0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(dices[i].Compare(dices[j])==true){
					allDifference=false;
					break;
				}
			}
		}
		if(allDifference)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
class Dice4{
	int T,F,R,L,B,D;
	int[] MaxMin = new int[2];

	public Dice4(int[] point){
		this.MaxMin[0]=this.MaxMin[1]=point[0];
		this.T=point[0];
		this.F=point[1];
		this.R=point[2];
		this.L=point[3];
		this.B=point[4];
		this.D=point[5];
		for(int i=0;i<6;i++){
			if(this.MaxMin[0]<point[i]){
				this.MaxMin[0]=point[i];
			}
			if(this.MaxMin[1]>point[i]){
				this.MaxMin[1]=point[i];
			}
		}
	}
	
	public Boolean Compare(Dice4 otherdice){
		Boolean Same=true;
		if((this.MaxMin[0]!=otherdice.MaxMin[0])||(this.MaxMin[1]!=otherdice.MaxMin[1]))
			Same=false;
		else{	
			for(int i=0;i<2;i++){
				Same=true;
				this.MoveToBottom(this.MaxMin[i]);
				otherdice.MoveToBottom(otherdice.MaxMin[i]);
				if((this.T!=otherdice.T)){
					Same=false;
				}
				if(Same){
					for(int j=0;j<4;j++){
						if(this.F==otherdice.F&&this.B==otherdice.B&&this.L==otherdice.L&&this.R==otherdice.R){
							Same=true;
							break;
						}
						else
							Same=false;
							otherdice.Move('R');
					}
				}
				if(Same)
					break;
			}
		}
		return Same;
	}
	
	public void MoveToBottom(int point){
		while(true){
			if(this.D==point){
				break;
			}
			else if(this.T==point){
				this.Move('S');
				this.Move('S');
				break;
			}
			else if(this.F==point){
				this.Move('S');
				break;
			}
			else{
				this.Move('R');
			}
		}
	}
	
	public void Move(char move){
		int temp;
		switch(move){
			case 'E':
				temp=this.D;
				this.D=this.R;
				this.R=this.T;
				this.T=this.L;
				this.L=temp;
				break;
			case 'S':
				temp=this.D;
				this.D=this.F;
				this.F=this.T;
				this.T=this.B;
				this.B=temp;
				break;
			case 'W':
				temp=this.D;
				this.D=this.L;
				this.L=this.T;
				this.T=this.R;
				this.R=temp;
				break;
			case 'N':
				temp=this.D;
				this.D=this.B;
				this.B=this.T;
				this.T=this.F;
				this.F=temp;
				break;
			case 'R':
				temp=this.F;
				this.F=this.R;
				this.R=this.B;
				this.B=this.L;
				this.L=temp;
		}
	}
}
