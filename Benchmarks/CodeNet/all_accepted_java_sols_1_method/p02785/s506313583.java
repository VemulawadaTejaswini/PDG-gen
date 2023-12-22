import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
      	int numMonster = s.nextInt();
      	int numSpMoves = s.nextInt();
      	if(numSpMoves>numMonster){
      	    System.out.println("0");
      	    return;
      	}
      	List<Integer> monsterList = new ArrayList<Integer>(numMonster);
      	for(int i=0;i<numMonster;i++){
        	monsterList.add(s.nextInt());
        }
      	Collections.sort(monsterList);
      	for (int i=0;i<numSpMoves ;i++ ){
      	    monsterList.remove(numMonster-i-1);
      	} 
      	long numAttack = 0;
      	for(int i=0;i<monsterList.size();i++){
      	    numAttack+=monsterList.get(i);
      	}
      	System.out.println(numAttack);
    }
}