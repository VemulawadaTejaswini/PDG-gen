<?php
//すべてのカードを配列に格納。
$mark = array("S ","H ","C ","D ");
$cardIndex = 0;
for($first = 0; $first < 4; $first++){
    for($second = 0; $second < 13; $second++){
        $hasCard[$cardIndex] = (String)($mark[$first].($second + 1));
        $cardIndex++;
    }
}
//ここからできていない。
$intLength = trim(fgets(STDIN));
for($first = 0; $first < $intLength; $first++){
    $giveCard[first] = trim(fgets(STDIN));
}
for($first = 0; $first < count($hasCard); $first++){
    for($second = 0; $second < $intLength; $second++){
        if($hasCard[$first] == $giveCard[$second]){
            unset($hasCard[$first]);
            $hasCard = array_values($hasCard);
            $first--;
        }
    }
}
//ここはできている。
for($first = 0; $first < count($hasCard); $first++){
    echo $hasCard[$first];
    echo "<br />";
}
?>

