import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.next());
		List<Dice> dices = new ArrayList<>();
		
		for(int i = 0; i <number;i++){
			List<Integer> diceParam  = new ArrayList<>();
			
			for(int j = 0;j < 6;j++){
				
				diceParam.add(Integer.parseInt(sc.next()));
			}
			
			
			Dice dice = new Main().new Dice(diceParam);
			dices.add(dice);
			
		}
		
		if(isALLIdentical(dices)){
			
			System.out.println("Yes");
			
		}else{
			System.out.println("No");
		}
		
		sc.close();
		

	}
	
	public static boolean isALLIdentical(List<Dice> dices){
		
		for(int i=0;i<dices.size() -1 ;i++){
			
			for(int j=i+1; j < dices.size();j++){
				
				if(dices.get(i).isIdenticalTo(dices.get(j))){
					
					return false;
				}
				
			}
			
		}
		
		return true;
	}
	
	class Dice{
		
		private int one;
		private int two;
		private int three;
		private int four;
		private int five;
		private int six;
		
		Dice(List<Integer> arg){
			
			if(arg == null || arg.size() != 6){
				throw new IllegalArgumentException();
			}
			
			this.one  = arg.get(0);
			this.two  = arg.get(1);
			this.three= arg.get(2);
			this.four = arg.get(3);
			this.five = arg.get(4);
			this.six  = arg.get(5);
			
		}
		
		
		Dice roll(String direction){
			int tmp;
			switch(direction){
			
			case "N":
				
				tmp = this.five;
				this.five = this.one;
				this.one  = this.two;
				this.two  = this.six;
				this.six  = tmp;
				break;
				
			case "S":
				tmp = this.five;
				this.five = this.six;
				this.six  = this.two;
				this.two  = this.one;
				this.one  = tmp;
				break;
			case "W":
				tmp = this.one;
				this.one = this.three;
				this.three  = this.six;
				this.six  = this.four;
				this.four  = tmp;
				break;
				
			case "E":
				tmp = this.one;
				this.one = this.four;
				this.four  = this.six;
				this.six  = this.three;
				this.three  = tmp;
				break;
			}
			
			return this;
		}
		
		
		int showTop(){
			return this.one;
		}
		
		int showFront(){
			return this.two;
		}
		
		int showRight(){
			return this.three;
		}
		
		int showLeft(){
			return this.four;
		}
		
		int showBack(){
			return this.five;
		}
		
		int showDown(){
			return this.six;
		}
		
		
		public boolean isIdenticalTo(Dice dice) {
			
			for(int i = 0; i <4 ;i++){
				
				for(int j = 0; j<4 ;j++){
				
					if(this.one == dice.one &&
					this.two == dice.two    &&
					this.three==dice.three  &&
					this.four ==dice.four   &&
					this.five ==dice.five   &&
					this.six  ==dice.six    
					){
						return true;
					}
					dice.roll("E");
				}
				
				dice.roll("N");
				
			}
			
			dice.roll("E");
			dice.roll("N");
			
			
			for(int i = 0; i <4 ;i++){
				
				for(int j = 0; j<4 ;j++){
				
					if(this.one == dice.one &&
					this.two == dice.two    &&
					this.three==dice.three  &&
					this.four ==dice.four   &&
					this.five ==dice.five   &&
					this.six  ==dice.six    
					){
						return true;
					}
					dice.roll("E");
					
				}
				
				dice.roll("N");
				
			}
			
			return false;
		}
		
	}
}

