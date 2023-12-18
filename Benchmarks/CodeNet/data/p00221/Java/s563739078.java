import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
		FizzBuzz fb;
		for(;;) {
			m = sc.nextInt();
			n = sc.nextInt();
			if(m==0 && n==0) {
				break;
			}
			
			fb = new FizzBuzz(m);
			for(int i=0; i<n; i++) {
				if(!fb.sayNextStatement(sc.next())) {
					break;
				}
			}
			
			fb.showPlayer();
		}
	}
}

class FizzBuzz {
	private int current,currentPlayer;
	private int m;
	private int[] player;
	
	public FizzBuzz(int m) {
		current = 0;
		currentPlayer = 0;
		this.m = m;
		player = new int[m];
		for(int i=0; i<m; i++) {
			player[i] = i+1;
		}
	}
	
	public void showPlayer() {
		for(int pl:player){
			if(pl != -1){
				System.out.println(pl);
			}
		}
	}
	
	public boolean sayNextStatement(String statement) {
		try {
			int num = Integer.valueOf(statement);
			if(!checkFizzBuzz(num)) {
				player[currentPlayer] = -1;
			}
		} catch(NumberFormatException e) {
			if(!checkFizzBuzz(statement)) {
				player[currentPlayer] = -1;
			}
		}
		
		if(!checkPlayer()) {
			return false;
		}
		
		setCurrentPlayer();
		
		return true;
	}
	
	private boolean checkPlayer() {
		int count = 0;
		
		for(int i=0; i<m; i++) {
			if(player[i] != -1) {
				count ++;
			}
		}
		
		if(count == 1) {
			return false;
		} else {
			return true;
		}
	}
	
	private void setCurrentPlayer() {
		if(currentPlayer+1 == m) {
			currentPlayer = 0;
		} else {
			currentPlayer ++;
		}
		
		while(player[currentPlayer] == -1) {
			if(currentPlayer+1 == m) {
				currentPlayer = 0;
			} else {
				currentPlayer ++;
			}
		}
	}
	
	private boolean checkFizzBuzz(int statement) {
		current ++;
		
		if((current % 3 == 0) || (current % 5 == 0)) {
			return false;
		} else {
			if(current == statement) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	private boolean checkFizzBuzz(String statement) {
		current ++;
		if((current % 3 == 0) && (current % 5 == 0)) {
			if(statement.equals("FizzBuzz")) {
				return true;
			} else {
				return false;
			}
		} else if(current % 3 == 0) {
			if(statement.equals("Fizz")) {
				return true;
			} else {
				return false;
			}
		} else if(current % 5 == 0) {
			if(statement.equals("Buzz")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}