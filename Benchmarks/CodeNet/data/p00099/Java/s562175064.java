import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] P_E = br.readLine().split(" ");

        int PlayerNum = Integer.parseInt(P_E[0]);
        int EventNum = Integer.parseInt(P_E[1]);
        
        int[] Fishes = new int[PlayerNum + 1];
        Arrays.fill(Fishes, 0);
        
        
        
/*
        TopPlayer TopPlayers = new TopPlayer();
*/      
        for(int i = 0; i < EventNum; i++){
            String[] P_G = br.readLine().split(" ");
            int PlayerID = Integer.parseInt(P_G[0]);
            int GetFishNum = Integer.parseInt(P_G[1]);
            Fishes[PlayerID] += GetFishNum;

            int MaxFishes = 0, TopPlayerID = 1;
            for(int p = 0; p < Fishes.length; p++){
                if(MaxFishes < Fishes[p]){
                    MaxFishes = Fishes[p];
                    TopPlayerID = p;
                }
                else if(MaxFishes == Fishes[p]){
                    TopPlayerID = p < TopPlayerID ? p : TopPlayerID;
                }
            }
/*
            while(true){
                CurrentTopPlayer = TopPlayers.peek();
                if(CurrentTopPlayer.PlayerID == PlayerID){
                    CurrentTopPlayer = TopPlayers.poll();
                }
                else break;
            }
            
            if(CurrentTopPlayer.Fishes < Fishes[PlayerID]){
                TopPlayers.push(new TopPlayer(PlayerID, Fishes[PlayerID]));
            }
            else if(CurrentTopPlayer.Fishes == Fishes[PlayerID]){
                if(PlayerID < CurrentTopPlayer.PlayerID){
                    TopPlayers.push(CurrentTopPlayer);
                    TopPlayers.push(new TopPlayer(PlayerID, Fishes[PlayerID]));
                }
                else{
                    TopPlayers.push(new TopPlayer(PlayerID, Fishes[PlayerID]));
                    TopPlayers.push(CurrentTopPlayer);
                }
            }



            CurrentTopPlayer = TopPlayers.peek();
            System.out.println(CurrentTopPlayer.PlayerID + " " + CurrentTopPlayer.Fishes);
*/
            System.out.println(TopPlayerID + " " + MaxFishes);
        }
    }
}
/*
class TopPlayer {
    public int MaxFishes;
    public ArrayList<int> Tie;
    TopPlayer(){
        MaxFishes = 0;
        Tie = new ArrayList<int>();
    }
}
*/